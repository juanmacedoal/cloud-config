# Cloud Server

## Description

This is the cloud configuration server server

## Configurations 


```yml
spring:    
  ...
  cloud: 
    ...
    config:
      ...
      server:
        git:
          uri: ${GITCONFIG_URI:https://git-/vac-configurations}
          username: ${GITCONFIG_USERNAME:}
          password: ${GITCONFIG_PASSWORD:}
          default-label: ${GITCONFIG_LABEL:develop}                                
          timeout: 60
```

To use it set the mapping in the hosts file

```
127.0.0.1   
```

## How to run
 
Just run it, no profile is required.
