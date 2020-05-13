# redpins (backend)
Handles data for redpins-client. Client-server communication is handled by Rest-services. The application is build on Springboot.

## Run application
```
gradle bootRun
```

##Generate keystore for HTTPS
```keytool -genkey -alias redpins -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650```

