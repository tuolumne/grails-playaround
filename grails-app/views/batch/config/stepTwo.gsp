<html>
<head>
<title>STEP 2 of 2</title>
</head>
<body>
<h1>Step 2</h1>
<p> ${ params.source }
<g:form action="config">
<g:radioGroup values="${['one','two','three']}" name="myVar" value="one">
<p><g:message code="${it.label}" />: ${it.radio}</p>
</g:radioGroup>
<g:submitButton name="previous" value="Previous" />
<g:submitButton name="cancel" value="Cancel" />
<g:submitButton name="finish" value="Finish" />
</g:form>
</body>
</html>