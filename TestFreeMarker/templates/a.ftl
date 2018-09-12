你好，${user},今天你得精神不错！
---------------------------------------
测试if语句：
<#if user!="李大爷">
	大爷！
</#if>
***************************************
${random}
<#if random gte 60>
	及格
<#else>
	不及格！
</#if>
***************************************
<#if random gte 90>
	优秀
<#elseif random gte 80>
	良好
<#else>
	一般
</#if>
***************************************
---------------------------------------
测试list语句
<#list list as dizhi >
	<b>${dizhi}</b><br/>
</#list>
---------------------------------------
测试包含指令
<#include "included.txt" />
---------------------------------------
测试宏指令：
定义宏：
<#macro m1>
	<b>aaabbbccc</b>
	<b>dddeeefff</b>
</#macro> 
调用宏
<@m1 /><@m1 /><@m1 />
**************************************
测试带参宏：
<#macro m2 a b c >
	${a}--${b}--${c}
</#macro>
<@m2 "a" "123" "hello"  />

--------------------------------------
测试nest指令：
<#macro border>
	<table border=4 cellspacing=0 cellpadding=4>
		<tr>
			<td>
				<#nested>
			</td>
		</tr>
	</table>
</#macro>
<@border> sss</@border>

---------------------------------------
引入：

<#import "b.ftl" as bb />
<@bb.copyright date = "2010-2020" />
	${bb.mail}
<#assign mail= "amusunny@icloud.com" />
	${mail}
<#assign mail = "amusunny@icloud.com" in bb />
	${bb.mail}
------------------------------------------
测试数据类型：
<#assign boo=true />
${date1?string("YYYY-MM-dd")}

	
	
------------------------
