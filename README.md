# RoundView
1.可以轻松的在一个控件上实现圆角

使用方法：
  1.Add it in your root build.gradle at the end of repositories
  
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


  2.Add the dependency

    dependencies {
	        implementation 'com.github.ShadowWalkerGIT:RoundView:v1.0.0'
	  }


 3.具体使用
  3.1设置圆角，比如现在有个FrameLayout需要设置成圆角，调用以下代码
     ViewStyleSetter viewStyleSetter = new ViewStyleSetter(frameLayout);
     
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
	
            viewStyleSetter.setRound(30);//圆角弧度
	    
        }

  3.2设置圆形窗口，比如现在有个FrameLayout需要设置成圆形，调用以下代码
    ViewStyleSetter viewStyleSetter = new ViewStyleSetter(frameLayout);
    
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
	
            viewStyleSetter.setOval();
	    
        }
  3.3实现圆形效果是以矩形较短的边为直径，矩形中心点为圆心的一个圆形区域
