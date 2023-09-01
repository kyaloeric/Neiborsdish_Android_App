## Neiborsdish_Android_App
A food ordering and delivery android application coded in java, IDE android studio, Firebase DB


## Aim

The aim of this project, Food ordering and delivery Android Application, will be to develop a food ordering and delivery application that is for everyone with no restrictions since everyone, all hotels and restaurants in any location will be able to order and sell food anytime. An application that resolves all the redundancies of unexpected order cancelations and late deliveries. 


## Prerequisites

- [Android Studio](https://developer.android.com/studio) with the Android SDK.
- An Android device or emulator set up.
- Firebase project configured with the required services (e.g., Realtime Database, Firestore, Authentication).



## Installation Guide

      - Clone repository
      
      - Open the Project in your android studio
      - IMPORTANT:- Change the PackageName
     
#### Create Firebase project.
      - Connect Firebase with Android Studio.
      - Download the file google-service.json from firebase project setting and import into your project  
      -IMPORTANT FOR NOTIFICATION:- Copy Server key from Firebase/Project Setting/cloudmessaging/ and paste it in APIService.java class
      - After Registering as delivery person , copy UID of that delivery person from firebase and in :app/ChefFoodPanel/ChefPreparedOrderView.java" file at line 65=> String deliveryId = "oCpc4SwLVFbKO0fPdtp4R6bmDmI3"; paste here. Similarly, Do this in DeliveryPendingOrderFragment.java file 


## Build/Run Project

1.Build the project by clicking the "Build" menu and selecting "Build Project."

2.Connect your Android device to your computer or start an emulator.

3.Select your device or emulator from the device dropdown in the Android Studio toolbar.

4.Click the "Run" button (green triangle) in Android Studio to install and launch the app on your device or emulator.

5.If you prefer to use the command line, you can also run:

      ./gradlew installDebug

6.The app, integrated with Firebase, should now be running on your Android device or emulator.
