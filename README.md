# SeeMoreTextView-Android

To get SeeMoreTextView library into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ```
  Step 2. Add the dependency
  ```
  dependencies {
	        implementation 'com.github.AhmMhd:SeeMoreTextView-Android:1.0.0'
	}
  ```
  **************************************************************************************************************************************
  # USAGE

XML

```
<com.abdulhakeem.seemoretextview.SeeMoreTextView
        android:id="@+id/textview
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
	/>
```

set text to your textview using setContent

```
TextView seemoreTv = (TextView) findViewById(R.id.textview)

seemoreTv.setContent("some really long text here.")

```

set max length for the textview after which "seemore" will appear

```
seemoreTv.setTextMaxLength(300) //default is 250 charachters

```



  
  
  
