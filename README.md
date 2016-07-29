# WebRunApp
Android 从网页中跳转到APP
网页配置如下：
```xml
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我是中国人</title>
</head>
<body>
<iframe src="sharetest://data/123" style="display:none"></iframe>
</body>
</html>
```

加载网页：
```java
 webView.loadUrl("file:///android_asset/second.html");
 ```
 
 接收Activity配置：
 ```xml
  <activity android:name=".Main2Activity">
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data
                    android:host="data"
                    android:scheme="sharetest" />
            </intent-filter>
        </activity>
        ```
