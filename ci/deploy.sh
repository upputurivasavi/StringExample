#!/bin/bash

export env=$1
export version=$2
JAR_NAME=StringExample-${version}.jar
JAR_LOCATION=/home/travis/build/upputurivasavi/StringExample/target
CLASS_NAME="com.examples.StringExample"

if [ ${env} = "dev" ] || [ ${env} = "staging" ] || [ ${env} = "prod" ]; then 
    java -cp ${JAR_LOCATION}/${JAR_NAME} ${CLASS_NAME} upputuri vasavi
else 
    echo "Invalid Environment"
    exit 1
fi

export AWS_ACCESS_KEY_ID=AKIAIIPVSJ2XZNTDOW7A
export AWS_SECRET_ACCESS_KEY=wvEUsG0L5dAVuQfXM/wkX/lgCb8DL1upBDacP1Q2

aws s3 cp ${JAR_LOCATION}/${JAR_NAME} s3://hadoop-dev-example/${JAR_NAME}