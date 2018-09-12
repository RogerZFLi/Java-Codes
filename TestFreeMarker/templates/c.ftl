引入b.ftl:
<#import "b.ftl" as bb />
<@bb.copyright date = "2010-2020" />
	${bb.mail}
<#assign mail= "amusunny@icloud.com" />
	${mail}
<#assign mail = "amusunny@icloud.com" in bb />
	${bb.mail}