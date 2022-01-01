# Data binding helps user to avoid writing many no of.(findview by id) instead user can do direct access of view on the xml file

> ### DataBindingExample
### Step:1(insert build.gradle file in the app)

  buildFeatures {</br>
       dataBinding true </br>
  }

### Step:2(design the UI)
go to layout and select your activity layout xml file

### Step:3(Enable data binding on Layout file)

[ Opening layout tag </br>
 -- XML code --</br>
closing layout tag ]

#### After wrapping the xml code with layout tag,there will be a class produced with "ActivitymainBinding.java" as the name

### Step:4(Create data binding object and initialize on Main Activity)
private ActivitymainBinding binding;</br>
private int count=0;</br>
NP:setContentView not necessary while initialize binding object

binding=DataBindingUtil.setContentView(activity:this,r.layout.activity_main)

##### NP: we are avoiding the findviewByID() method calls.
##### Direct accessing of view on the xml file is now enabled
##### ex:
binding.score.setText(String.valueof(12));
