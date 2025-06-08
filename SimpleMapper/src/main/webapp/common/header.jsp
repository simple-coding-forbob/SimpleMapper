<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Header</title>
	
<!-- 	css 부트스트랩 cdn  -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
		<img src="<c:url value='/images/simple-coding.png'/>" width="20" height="20" />
    	simple-coding
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            부서
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/dept/dept.do'/>">Dept</a></li>
            <li><a class="dropdown-item" href="<c:url value='/dept/addition.do'/>">Add Dept</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            사원(퀴즈)
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/emp/emp.do'/>">Emp</a></li>
            <li><a class="dropdown-item" href="<c:url value='/emp/addition.do'/>">Add Emp</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Faq(마무리퀴즈)
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/faq/faq.do'/>">Faq</a></li>
            <li><a class="dropdown-item" href="<c:url value='/faq/addition.do'/>">Add Faq</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            fileDb
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/fileDb/fileDb.do'/>">fileDb</a></li>
            <li><a class="dropdown-item" href="<c:url value='/fileDb/addition.do'/>">Add fileDb</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            gallery
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/gallery/gallery.do'/>">gallery</a></li>
            <li><a class="dropdown-item" href="<c:url value='/gallery/addition.do'/>">Add gallery</a></li>
          </ul>
        </li>
      </ul>

    </div>
  </div>
</nav>
</body>
</html>
