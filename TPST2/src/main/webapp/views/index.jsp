<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<s:url namespace="/" action="produits" var="lien0"></s:url>
<s:a href="%{lien0}">Produits</s:a>
</body>
</html>