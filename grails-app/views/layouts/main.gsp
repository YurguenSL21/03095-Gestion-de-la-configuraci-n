<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <title>Gestión de la configuración - Proyecto 2</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <asset:link rel="icon" href="icon.png" type="image/x-ico"/>

        <asset:stylesheet src="application.css"/>

        <g:layoutHead/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
            <a class="navbar-brand" href="/#">
                <asset:image src="Icon.png"
                             alt="Gestión de automotores - Proyecto 2"/>
            </a>
            <a class="navbar-brand" href="/">Administración de Automotores</a>
            <button class="navbar-toggler"
                    type="button"
                    data-toggle="collapse"
                    data-target="#navbarContent"
                    aria-controls="navbarContent"
                    aria-expanded="false"
                    aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse"
                 aria-expanded="false"
                 style="height: 0.8px;"
                 id="navbarContent">
                <ul class="nav navbar-nav ml-auto">
                    <g:pageProperty name="page.nav"/>
                </ul>
            </div>
        </nav>
        <g:layoutBody/>
        <div id="spinner" class="spinner" style="display:none;">
            <g:message code="spinner.alt" default="Loading&hellip;"/>
        </div>
        <asset:javascript src="application.js"/>
        <footer class="navbar-dark fixed-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <p class="text-center text-muted">©
                            <span>${formatDate(date: new Date(), format:'yyyy')}</span>
                            <span>Gestión de la Configuración (3096) - Grupo B</span>
                        </p>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
