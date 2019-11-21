CONTAINER_NAME=forum

docker build -t $CONTAINER_NAME:lastest .

is_exist=`docker ps | grep $CONTAINER_NAME` 
if [ ! -z "$is_exist" ] ;then	         
	docker stop $CONTAINER_NAME
fi

is_exist=`docker ps -a | grep $CONTAINER_NAME`  

if [ ! -z "$is_exist" ] ;then	         
	docker rm $CONTAINER_NAME
fi 



docker run -d -p 8888:8888 --name=$CONTAINER_NAME $CONTAINER_NAME:lastest