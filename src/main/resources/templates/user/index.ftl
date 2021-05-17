<h1>User List</h1>
<u1>
    <#list users as data>
        <li>ID: ${data.id}, name: ${data.name}</li>
    </#list>
</u1>

<#--
<h1>User List</h1>

<ul>
        <#list ["red", "green", "blue"] as user>
                <li>ID: ${user}, name: ${user}</li>
        </#list>
</ul>-->
