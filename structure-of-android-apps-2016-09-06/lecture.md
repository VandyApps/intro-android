Structure of Android Applications
=================================

*Lecture given on 2016-09-06.*


# Before Lecture
## Install Android Studio
- Install android studio: https://developer.android.com/studio/index.html


# Lecture

## What is android?
- operating system for mobile devices
    - was a startup, acquired by google and mostly developed by google now
    - based on the linux kernel
    - base is fully open source, some extensions are not
- provides a framework to write applications in

## Why learn android?
- most popular mobile phone platform worldwide
    - also most popular in US
- distributions provided for hundreds of different devices
- most apps written in java, a performant, easy-to-learn, and already common language
- very easy to integrate with other applications
    - we'll talk about this later
- much easier to write apps for than other platforms (*this is a personal opinion!*)
- lots of companies write android apps
    - you can get a job this way, or do freelance work with this knowledge

## What are the differences between android and iOS?
- language
    - the android framework targets the JVM, most programs written in java
    - iOS compiles apps to binary code, can write in either Objective-C (ew) or Swift (cool)
- platform
    - extremely easy to use other android applications as part of your own app without needing to share source code
        - we'll talk about this in a bit
    - fantastic documentation
- ownership
    - android is open source
    - developed by google but adapted by a variety of external vendors
    - no dictatorial control
    - can be used on many different devices
    - iOS is the opposite for all of these

# What is an android application?

## Structure of an app
An android application can be thought of in many different ways. We'll look at two ways to think about what goes into an android application.

## Code/Resources/Manifest
- code: logic of the application
- resources: images, sound, documents embedded into your application
    - sound files that a music player would play would NOT be considered resources!
    - resources are things that your app has when it is installed
- manifest: file which tells android what code should be called in what situations
    - we'll go over this later
- this is what you need to write, as an application developer, to make an app
- we'll keep these in mind as we move towards writing apps
- this only matters internally -- users and other developers using your app do not care about this way of looking at an android application

## Activities/Services
- app provides *activities* ("pages") which users can interact with
- other android apps can call both your activities and *services* as part of their flow
- this is an external "black-box" view
- this is how users and other developers using your app will think about your app
- activities and services are declared in the manifest


# How your app talks to android
## Modes of interaction
We'll talk about the different ways your app can interact with the android operating system below.

## Activity
- activities can be thought of as the different "pages" of an application
![two activities](http://www.coderefer.com/wp-content/uploads/2015/05/switch_activity1.jpg)

## Activity layout
- each activity has a layout
    - layouts are specified in XML, or can be added dynamically in Java
    - usually we'll want to use XML when possible -- we'll discuss this later in the series
![android xml properties](https://web.archive.org/web/20130813183535/http://dchabmztumu0g.cloudfront.net/wp-content/uploads/2011/05/propertiesID.png)

## Exposing app functionality through activities
- activities can be called from other applications if declared in the manifest
    - this is one of the big selling points of android
- you can split your app into different activities to encapsulate different functions
    - we'll talk about how/why to do this later
![calling an email sender activity](https://www.tutorialspoint.com/android/images/send_email.jpg)

## UI elements
- e.g. buttons / images / text boxes / checkboxes / web views
- can add java code to "handle" when user interacts with one of these
    - for example, to display a dropdown list of completions as the user types into a text box

![dropdown list example](http://csharpcorner.mindcrackerinc.netdna-cdn.com/UploadFile/e14021/spinner-in-android-using-android-studio/Images/im3.jpg)

## Fragments
- mini activity
- allows you to set up a layout like an activity without making a whole new activity
- makes tabbed navigation easier
- we'll talk about this further later on in the course
![tab navigation example](https://i.stack.imgur.com/Doslb.png)

## Service
- background task
- allows you to run code outside of your application
- can be exposed to other applications
    - this is one of the big selling points of android
    - e.g. a music player can expose a service for playing a sound file
- allows for concurrency which is important for mobile devices
- we'll talk about these more later

## Notification
- interrupts the user with some important info
- goes to some activity if clicked

![notification example](https://www.tutorialspoint.com/android/images/notification_detail.jpg)

## Notification UI
- can have complex UI in the notification itself
- we'll go over how to add these to your app in a later lecture
![notification example](https://www.tutorialspoint.com/android/images/notification_detail.jpg)

# After Lecture
## Hello World App
Go through this tutorial (https://developer.android.com/training/basics/firstapp/index.html) through the *Running Your Application* section.
