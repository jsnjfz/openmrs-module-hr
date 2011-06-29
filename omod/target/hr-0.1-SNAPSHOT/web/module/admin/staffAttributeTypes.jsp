<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="localHeader.jsp" %>
<h2><spring:message code="Manage Staff Attribute Types" /></h2>
<br /><br />

<b class="boxHeader"><spring:message code="Current Staff Atrribute Types"/></b>
<form method="post" class="box">
	<table>
		<tr>
			<th> <spring:message code="general.name"/> </th>
			<th> <spring:message code="general.description"/> </th>
		</tr>
		<c:forEach var="staffAttributeType" items="${StaffAttributeTypeList}">
			<tr>
				<td valign="top">
					<a href="staffAttributeType.form?staffAttributeTypeId=${staffAttributeType.staffAttributeTypeId}">
						<c:choose>
							<c:when test="${staffAttributeType.retired == true}">
								<del>${visitAttributeType.name}</del>
							</c:when>
							<c:otherwise>
								${staffAttributeType.name}
							</c:otherwise>
						</c:choose>
					</a>
				</td>
				<td valign="top">${staffAttributeType.description}</td>
			</tr>
		</c:forEach>
	</table>
</form>

<a href="staffAttributeType.form"><spring:message code="Add New Staff Attribute Type"/></a>
<%@ include file="/WEB-INF/template/footer.jsp"%>