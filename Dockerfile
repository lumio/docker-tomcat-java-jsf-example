FROM tomcat:alpine

# Copy the nginx config file
COPY ./conf/nginx.conf /etc/nginx/conf.d/default.conf
