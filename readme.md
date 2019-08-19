# Cloud Server vac-config

## Description

This is the cloud configuration server server

## Configurations 

The cloud configurations are loaded from the AWS service Code Commit:

```yml
spring:    
  ...
  cloud: 
    ...
    config:
      ...
      server:
        git:
          uri: ${GITCONFIG_URI:https://git-codecommit.eu-west-1.amazonaws.com/v1/repos/vac-configurations}
          username: ${GITCONFIG_USERNAME:dromeroc@vectoritcgroup.com+1-at-156104699665}
          password: ${GITCONFIG_PASSWORD:jemP/mHckTtYbqPMRLFPgCLR0stv7GAwkrzo+JVDAjM=}
          default-label: ${GITCONFIG_LABEL:develop}                                
          timeout: 60
```

To use it set the mapping in the hosts file

```
127.0.0.1       vac-config
```

## How to run
 
Just run it, no profile is required.
