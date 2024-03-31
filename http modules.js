var http = require('http');
var server=http.createServer(function (req,res)
{ if(req.url=='/')
{ res.write('welcome to the index page');
res.end();
} else if (req.url== "/emp")
{ res.write('welcome to the employee page');
res.end();
}else if (req.url=="/admin")
{res.write('welcome to the admin page');
res.end();
} else res.eventNames('Invalid Request!'); });
server.listen(2020);
console.log('Server is running at port 2020')
# code by himanshu 
