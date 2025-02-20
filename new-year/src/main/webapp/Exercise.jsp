<!DOCTYPE html>
<html>
<head>
    <title>Exercise Data Viewer</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
</head>
<body>
<div class="container">
    <h1 class="animate__animated animate__fadeInDown">Exercise Data Viewer</h1>
    <div id="body-parts-section">
        <label for="body-parts">Select Body Part:</label>
        <select id="body-parts"></select>
        <button id="fetch-button" class="btn animate__animated animate__pulse animate__infinite">Fetch Exercise Data</button>
    </div>
    <div id="exercise-animations" class="exercise-grid"></div>
</div>
<script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>
</html>