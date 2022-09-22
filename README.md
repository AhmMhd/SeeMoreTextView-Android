#PLEASE NOTE, THIS PROJECT IS NO LONGER BEING MAINTAINED

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
toggle the state of the textview using:

```
seemoreTv.toggle()
```

expand or collapse the textview using:

```
seemoreTv.expandText(true|false)
```

set seemore seeless text color using:
```
seemoreTv.setSeeMoreTextColor(R,color.red) //default is #3F51B5
```

set seemore|seeless text using:

```
seemoreTv.setSeeMoreText("ShowMore","ShowLess") // default is "SeeMore" && "SeeLess"
```


# NOTE
Tested with recyclerview, works fine


  
  
  
