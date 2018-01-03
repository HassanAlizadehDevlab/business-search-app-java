[![Build Status](https://travis-ci.org/vestrel00/business-search-app-java.svg?branch=develop)](https://travis-ci.org/vestrel00/business-search-app-java)

# IMPORTANT!

1. THE ONLY PRESENTATION APPLICATION THAT IS FULLY FUNCTIONAL IS *presentation-java-nogui-mvp*
2. THE ANDROID APPLICATION *presentation-java-android-mvp* IS RUNNABLE BUT NOT YET FEATURE COMPLETE.
3. THIS PROJECT IS UNDER HEAVY DEVELOPMENT. BY NO MEANS IS IT CLOSE TO DONE.   
4. COMMITS HAVE BEEN PUSHED DIRECTLY INTO THE DEVELOP BRANCH INSTEAD OF THROUGH PULL REQUESTS.  
5. DEVELOP BRANCH COMMIT HISTORY IS EXTREMELY DIRTY.  
6. ONCE "COMPLETED", ALL CODE WILL BE RE-DONE PROPERLY WITH FEATURE BRANCHES, ISSUES, AND PULL REQUESTS.
7. AT THAT POINT ALL WORK WILL BE LOGGED IN DOCS/DEVELOPMENT_LOGS.MD AND MERGED THROUGH WELL-DOCUMENTED 
   PULL REQUESTS. IT WILL BE LIKE A HOW-TO / GUIDE TO CLEAN ARCHITECTURE.


# Business Search App (Java)

The purpose of this project is to demonstrate how to build Java applications from the ground up 
using clean architecture principles, Java best practices, and design patterns. 

It is less about the application content and more about the code and architecture. 

The goal is to showcase object oriented programming in Java, Java Swing, Kotlin, and Android, including:

- Reactive programming with [RxJava 2](https://github.com/ReactiveX/RxJava/tree/2.x) and 
  [RxAndroid 2](https://github.com/ReactiveX/RxAndroid/tree/2.x)
- Dependency injection with [Dagger 2](https://github.com/google/dagger)
- View binding with [Butterknife](https://github.com/JakeWharton/butterknife/tree/master)
- Networking with [Retrofit 2](https://github.com/square/retrofit/tree/parent-2.2.0)
- De/serialization with [Jackson Databind 2](https://github.com/FasterXML/jackson-databind/tree/jackson-databind-2.8.8)
- Automatic code generation with [AutoValue](https://github.com/google/auto/tree/auto-value-1.4.1/value)
- Maps with [Google Maps APIs](https://developers.google.com/maps/documentation/android-api/)
- Testing with [JUnit 4](https://github.com/junit-team/junit4/blob/master/doc/ReleaseNotes4.12.md), 
  [AssertJ](http://joel-costigliola.github.io/assertj/),
  [Mockito 2](https://github.com/mockito/mockito/tree/release/2.x), 
  [Robolectric 3](https://github.com/robolectric/robolectric/tree/robolectric-3.3.2), and
  [Espresso 2](https://google.github.io/android-testing-support-library/docs/espresso/index.html)
- Writing code using [clean architecture](https://github.com/android10/Android-CleanArchitecture) principles,
  [Model-View-Presenter](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) (MVP) pattern, and
  [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) pattern
- Monolithic project management with the [Gradle build-tool](https://docs.gradle.org/3.4.1/userguide/userguide.html)
- Continuous Integration with [Travis CI](https://travis-ci.org/)
- Mobile application development with [Android](https://developer.android.com/training/index.html)
  using java and [Kotlin](https://kotlinlang.org/docs/reference/android-overview.html)
- Desktop application development with [Java Swing](http://docs.oracle.com/javase/tutorial/uiswing/)
- Java best practices and design patterns
- Creating readable, focused, and well-documented pull requests


## Derivative Projects
 
This project has the following derivative projects, which showcases / walks through different portions 
of this project's architecture. 

1. [Android Dagger (2.11/2.12/2.13) Butterknife (8.7/8.8) MVP](https://github.com/vestrel00/android-dagger-butterknife-mvp)


## Application and Features

A simple business search application using the
[Yelp Fusion (v3) REST API](https://www.yelp.com/developers/documentation/v3/get_started).

This simple business search application is able to:

- display businesses around a location
- display businesses around a set of coordinates
- display business details

**Notes**

- The application is kept short and simple with minimal styling and no advanced UI for brevity. 
- The [Yelp Android API](https://github.com/Yelp/yelp-android) is not used in order to showcase 
  usage of [Retrofit 2](https://github.com/square/retrofit/tree/parent-2.2.0)

## Applications

The application has several different presentations. In other words, there are several different
runnable applications that can be installed in different platforms.

1. **presentation-java-nogui-mvp**: Plain Java command line / console app written using the MVP pattern.
2. **presentation-java-swing-mvp**: Java Swing app written using the MVP pattern.
3. **presentation-java-swing-mvvm**: Java Swing app written using the MVVM pattern.
4. **presentation-java-android-mvp**: Android app written in Java using the MVP pattern.
5. **presentation-java-android-mvvm**: Android app written in Java using the MVVM pattern.
6. **presentation-kotlin-android-mvp**: Android app written in Kotlin using the MVP pattern.

All of the above presentations use the same domain and data layer.


## Building and Running the Applications

**[JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)** is 
required to build and run this project.

#### Using Android Studio

You may **open** this project in [Android Studio](https://developer.android.com/studio/index.html) 
(v2.3.1).

- For plain Java applications, you must Build -> Make Project in order to build them.
  There are several plain Java applications:

  - presentation-java-nogui-mvp
  - presentation-java-swing-mvp
  - presentation-java-swing-mvvm

- For Android applications, click Build -> Rebuild Project is enough. However, it will not build 
  plain Java applications as mentioned above. There are several Android applications:
  
  - presentation-java-android-mvp
  - presentation-java-android-mvvm
  - presentation-kotlin-android-mvp
  
Since this project contains a mix of plain Java modules and Android modules, the best way to ensure
that all modules are built properly is to

  - Build -> Clean Project
  - Build -> Make Project

**Running the applications**

After building/making the project, the applications may then be run.

- For plain Java applications, navigate to the *ApplicationRunner.java* file, right click, and
  select Run 'ApplicationRunner.main()'. If this does not work in Android Studio, try 
  **Using Gradle** method in the command line.
- For Android applications, select the desired run configuration and 
  select Run -> Run '(presentation-module-to-run)'
  
#### Using Gradle

To build all modules,

```
./gradlew build
```

Note that building all modules may result in parallel build failure due to concurrent file 
access resulting in file deadlocks. See FIXME about `org.gradle.parallel` in gradle.properties.

To build all variants of a specific module,

```
./gradlew :<module>:build
```

For example, to build the *presentation-java-nogui-mvp* application,

```
./gradlew :presentation-java-nogui-mvp:build
```

To list all tasks for this project,

```
./gradlew tasks
```

To list all tasks for a specific module,

```
./gradlew :<module>:tasks
```

For example, to list all tasks for the *presentation-java-nogui-mvp* module,

```
./gradlew :presentation-java-nogui-mvp:tasks
```

**Running the applications**

- For plain Java applications,

  ```
  ./gradlew :<java-presentation-module>:run
  ```

  For example, to run the *presentation-java-nogui-mvp* application,

  ```
  ./gradlew :presentation-java-nogui-mvp:run
  ```

  You may also generate and run via jar,

  ```
  ./gradlew :<java-presentation-module>:jar
  java -jar <java-presentation-module>/build/libs/<name-of-jar>.jar 
  ```

  For example, to generate and run the jar of the *presentation-java-nogui-mvp* application,

  ```
  ./gradlew :presentation-java-nogui-mvp:jar
  java -jar presentation-java-nogui-mvp/build/libs/presentation-java-nogui-mvp-1.0.0.jar 
  ```
  
- For Android applications,

  ```
  ./gradlew :<android-presentation-module>:install<build_variant>
  ```

  For example, to install the *presentation-java-android-mvp* debug application,

  ```
  ./gradlew :presentation-java-android-mvp:installDebug
  ```

**Known Issues**

1. If building fails due to a read/write process lock or any file related error, this may be due to
   org.gradle.parallel set to true in gradle.properties. This allows for parallel tasks which
   could result in several gradle processes accessing the same files at the same time. 
   
   For example, ```./gradlew build``` builds all projects in parallel, which may result in the 
   following error,
   
   > :presentation-java-android-mvp:transformClassesAndResourcesWithProguardForRelease FAILED
     :presentation-java-android-mvvm:transformClassesAndResourcesWithProguardForRelease FAILED
   
   You will need to stop the existing gradle daemons and try again (without cleaning).
   
   ```./gradlew --stop```
   
   You may want to build a specific variant of a specific module to avoid this synchronization issue.
   
   ```./gradlew :<presentation-module>:build<build_variant>```
   
2. If anything unexpected occurs, clean the project first and try again.

    ```./gradlew clean```


## Architecture

This project's adaptation of the clean architecture guidelines is inspired by the 
[Clean Architecture sample app](https://github.com/android10/Android-CleanArchitecture) by android10. 
Take a look at the [Clean Architecture sample app](https://github.com/android10/Android-CleanArchitecture) 
for links to blogs discussing the architecture.

#### Considerations

Not one project is perfect. Not one architectural pattern is without flaws. There is no 1 size fits all
architecture. The same goes for this project. With that said, there are a couple of things to consider 
about this project's architecture;

1. Does there need to be separate entities/models for each layer? That is, `Entity` in the data layer, 
   `DomainObject`in the domain layer, and `Model` in the presentation layers?

   > Keeping these objects separate allows each layer to be completely independent from the other layers. 
     It follows one of the clean architecture principles' on the separation of layers. In practical terms, 
     each layer have complete control on what these objects should be. Furthermore, the amount of 
     inter-layer imports are kept to a minimum. This increases the modules's modularity. A change from 
     one layer will not affect the other layers, except for "mappers".
   >
   > However, this abstraction comes at the cost of code duplication and having to create "mappers". 
     Given the current state of the project, the advantage of this abstraction does not seem to 
     outweigh its costs. A more pragmatic approach is to only have a data layer and a presentation 
     layer where the data layer provides the entities for the presentation layer to use.
    
2. Currently, the domain layer provides interactors / use cases that simply call the repository 
   implementations provided by the data layer. So, why not get rid of the domain layer and just use 
   the data layer directly?

   > As mentioned in point 1, this would be the more pragmatic approach. However, the domain layer 
     is important in future-proofing. What if a reporting call needs to be fired when a use case is 
     executed? What if all use cases need to be logged? What if API X needs to be used in use case Y?
     The domain layer serves as the middleman between the presentation layer and other layers / APIs.


## Development Logs

All work has been logged, including:

- the steps taken in creating this project from start to finish (current code) in chronological order
- thought process for each step; "why do it this way?", "why use that library?", etc
- references to issues and pull requests for each step
 
See more in *docs/DEVELOPMENT_LOGS.md*.


## Tests

#### Unit Tests

JUnit4, AssertJ, Mockito2, and Robolectric3 are used for unit testing Android and pure Java classes.

To run all unit tests,

```
./gradlew test
```

To run all unit tests for a specific module,

```
./gradlew :<presentation-module>:test
```

#### Instrumentation Tests

Espresso is used for Android instrumentation tests.

To run all instrumentation tests,

```
./gradlew connectedAndroidTest
```

To run all instrumentation tests for a specific Android module,

```
./gradlew :<android-presentation-module>:connectedAndroidTest
```

Note that only debug build types support Android instrumentations tests.

#### Jacoco Test Report

Code coverage is available through the use of the jacoco plugin.

To generate test reports for all modules,

```
./gradlew jacocoTestReport
```

To generate test reports for a specific module,

```
./gradlew :<module>:jacocoTestReport
```


## Static Analysis

The following static analysis checks are used to enforce high code quality and compliance to 
standard Java (and Android) code style and patterns:

- [Checkstyle](http://checkstyle.sourceforge.net/)
- [Findbugs](http://findbugs.sourceforge.net/)
- [PMD](https://pmd.github.io/)
- [Android lint](http://tools.android.com/tips/lint)

You can read more about these tools in this 
[blog post](http://vincentbrison.com/2014/07/19/how-to-improve-quality-and-syntax-of-your-android-code/).

To run all static analysis checks for all modules,

```
./gradlew checkQuality
```


To run all static analysis checks for a specific module,

```
./gradlew :<module>:checkQuality
```

## Javadoc

Javadoc is available. To generate the Javadocs, 

To generate Javadocs for all modules,

```
./gradlew javadoc
```

To generate Javadocs for a specific module,

```
./gradlew :<module>:javadoc
```


## Code Style

Styling is very important in maintaining a codebase with multiple (and large amounts) of contributors.
A set of code style guidelines are enforced by this project, most of which are checked by
the static analysis tool checkstyle. Read more in *docs/STYLE.md*.

## License

    Copyright 2018 Vandolf Estrellado
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


