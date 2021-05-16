Easy Toaster Library to show Toast in Android

mukeshkumar7470/EasyToaster-Library Version	1.0.0

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.mukeshkumar7470:EasyToaster-Library:1.0.0'
	}
  


Step 3. In your Activity or where you want to use only call the method:

	ToasterMessage.s(Classname.this, "Thanks for Click here");
