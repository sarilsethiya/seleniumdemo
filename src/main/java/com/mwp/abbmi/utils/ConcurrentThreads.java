package com.mwp.abbmi.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentThreads {

	private static final int MYTHREADS = 30;

	public static void main(String args[]) throws Exception {
		System.out.println("demo");
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		String[] hostList = { "http://crunchify.com", "http://yahoo.com", "http://www.ebay.com", "http://google.com",
				"http://www.example.co", "https://paypal.com", "http://bing.com/", "http://techcrunch.com/",
				"http://mashable.com/", "http://thenextweb.com/", "http://wordpress.com/", "http://wordpress.org/",
				"http://example.com/", "http://sjsu.edu/", "http://ebay.co.uk/", "http://google123.co.uk/",
				"http://wikipedia.org/", "http://en.wikipedia.org" };

		for (int i = 0; i < hostList.length; i++) {

			String url = hostList[i];
			// Runnable runnable = new MyRunnable();
			// MyRunnable runnable = new MyRunnable();

			// Runnable runnable =
			// () -> { System.out.println("Lambda Runnable running"); };

			Runnable worker = new MyRunnable(url);
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish

	}

}

class MyRunnable implements Runnable {

	public MyRunnable(String url) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
