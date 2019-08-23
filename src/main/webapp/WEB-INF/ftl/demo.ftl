<#--<h3>从Action中获得对象，与EL表达式类似</h3>-->
<#--<p style="color:red">${m1.size()}-->
<#--</p>-->
<#--<p>在applicationContext中已经配置了freemarker中date和datetime的格式，此处直接使用即可</p>-->
<#--<p style="color:red">${user.birthday?datetime}-&ndash;&gt;${user.birthday?date}</p>-->
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<h3>从Action中获得集合，无需使用JSTL，而是使用#list</h3>

    <table class="table">
        <caption>HRMRrportBO</caption>
        <thead>
        <tr class="success">
            <th>部门编号</th>
            <th>月初人数</th>
            <th>月末人数</th>
            <th>新入职人数</th>
            <th>离职人数</th>
            <th>研究生</th>
            <th>本科</th>
            <th>大专</th>
            <th>高中及以下</th>
        </tr>
        </thead>
        <tbody>
         <#list m1 as wcs >
        <tr class="active">
            <td>${wcs.emp.dno}</td>
            <td>${wcs.personNum.mbegin}</td>
            <td>${wcs.personNum.mend}</td>
            <td>${wcs.personNum.newemp}</td>
            <td>${wcs.personNum.dimemp}</td>
            <td>${wcs.edu.master}</td>
            <td>${wcs.edu.bachelor}</td>
            <td>${wcs.edu.college}</td>
            <td>${wcs.edu.senior}</td>

        </tr>



         </#list>


        <#--<h3>获取传入到Action中的参数</h3>-->
        <#--<p style="color: blue;">${RequestParameters.movie}</p>-->
        <#--<p style="color: blue;">movie=${param}</p>-->
