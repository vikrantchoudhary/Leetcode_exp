package com.leetcode.exp.Leetcode_exp.ThreadsExp;

public class ThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException{
        MarvelThreadLocal wolverine = new MarvelThreadLocal("Wolverine", true);
        startJoinThread(wolverine);
        System.out.println(wolverine.xmanName.get());
        startJoinThread(new MarvelThreadLocal("Xavier", true));
        startJoinThread(new MarvelThreadLocal("Cyclops", false));
    }

private static void startJoinThread(MarvelThreadLocal marvelThreadLocal) throws InterruptedException{
        // TODO Auto-generated method stub
        marvelThreadLocal.start();
        marvelThreadLocal.join();
    }

static class MarvelThreadLocal extends Thread {
    ThreadLocal<String> xmanName = new ThreadLocal<>();
    boolean canBeatMagneto;
    MarvelThreadLocal(String name, boolean canBeatMagneto) {
        xmanName.set(name);
        this.canBeatMagneto = canBeatMagneto;
    }
    public void run() {
        if (canBeatMagneto) {
            System.out.println(xmanName.get());
        }else  {
            System.out.println("Magento");
        }
    }
}
}
