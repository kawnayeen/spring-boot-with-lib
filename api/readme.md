Api
===
Using package from https://github.com/kawnayeen/hello-package

Inorder to resolve the package, you need to add `build.properties` file. You will find the content of 
this file at `example.build.properties`

If you want to resolve the package from you github account, then generate 
a token `settings -> developer settings -> personal access token` and use that value in `build.properties`
file. And set your username in the following block of `build.gradle` file

```
credentials {
    username "kawnayeen"
    password props.getProperty("token")
}
```
