var express = require('express');
var app = express();
var proxy = require('http-proxy-middleware');

const {routes} = {
     "routes": [
    {
      "route": "/mock",
      "url": "http://localhost:8082"
    },
    {
      "route": "/dev",
      "url": "http://localhost:8081"
    },
    {
      "route": "/api",
      "url": "http://localhost:8081"
    }
  ]
}

for (route of routes) {
    app.use(route.route,
        proxy({
            target: route.url,
            pathRewrite: (path, req) => {
                if(!path.startsWith("/api")) // just for now
                    return path.split('/').slice(2).join('/');
                else
                    return path;
            }
        })
    );
}

app.use(express.static('public'));
app.use(express.static('.'));
app.listen(3000);
console.log("Started server on 3000");