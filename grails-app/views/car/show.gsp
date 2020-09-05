<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'car.label', default: 'Automotor')}" />
    </head>
    <body>
        <a href="#show-car"
           class="skip" tabindex="-1">
           <g:message code="default.link.skip.label" default="Skip to content&hellip;"/>
        </a>
        <div class="nav" role="navigation">
            <ul>
                <li>
                    <a class="home" href="${createLink(uri: '/')}">
                        <g:message code="default.home.label"/>
                    </a>
                </li>
                <li>
                    <g:if test="${isEditor}">
                        <g:link class="list" action="index" params="[editorMode: true]">
                            <g:message code="default.list.label" args="[entityName]" />
                        </g:link>
                    </g:if>
                    <g:else>
                        <g:link class="list" action="index">
                            <g:message code="default.list.label" args="[entityName]" />
                        </g:link>
                    </g:else>
                </li>
                <li>
                    <g:if test="${isEditor}">
                        <g:link class="create" action="create" params="[editorMode: true]">
                            <g:message code="default.new.label" args="[entityName]" />
                        </g:link>
                    </g:if>
                </li>
            </ul>
        </div>
        <div id="show-car"
             class="content scaffold-show"
             role="main">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:display bean="car" />
            <g:if test="${isEditor}">
                <g:form resource="${this.car}" method="DELETE">
                    <fieldset class="buttons">
                        <input class="delete"
                               type="submit"
                               value="${message(code: 'default.button.delete.label', default: 'Eliminar')}"
                               onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: '¿Está seguro?')}');" />
                    </fieldset>
                </g:form>
            </g:if>
        </div>
    </body>
</html>
