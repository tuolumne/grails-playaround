<html>
<head>
<title>STEP 1 of 2</title>
</head>
<body>
<h1>Step 1</h1>
<g:form action="config">
<g:radioGroup values="${['one','two','three']}" name="myVar" value="two">
<p><g:message code="${it.label}" />: ${it.radio}</p>
</g:radioGroup>
<g:submitButton name="cancel" value="Cancel" />
<g:submitButton name="next" value="Next" />
</g:form>
</body>
</html>