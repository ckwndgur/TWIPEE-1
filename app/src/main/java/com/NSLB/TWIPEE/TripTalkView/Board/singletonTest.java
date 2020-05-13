package com.NSLB.TWIPEE.TripTalkView.Board;

class singletonTest {
   private singletonTest()
   {
   }

   private static class LazyHolder {
       public static final singletonTest INSTANCE = new singletonTest();
   }

   public static singletonTest getInstance()
   {



       return LazyHolder.INSTANCE;
   }


}

