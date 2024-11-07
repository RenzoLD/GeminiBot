<h1 align="center">GeminiBot 🤖</h1>

<p>GeminiBot es un chatbot desarrollado en Android utilizando Kotlin. Este proyecto está diseñado siguiendo buenas prácticas de arquitectura, utilizando una estructura de carpetas modular para una fácil mantenibilidad y escalabilidad.</p>

<h2>📜 Descripción del Proyecto</h2>

<p>GeminiBot es un asistente virtual impulsado por una API, diseñado para responder a las consultas de los usuarios de manera rápida y eficiente. Utiliza la arquitectura MVVM (Model-View-ViewModel) para separar la lógica de la interfaz de usuario de la lógica de negocio, mejorando la organización del código y facilitando las pruebas unitarias.</p>

<h2>🚀 Tecnologías y Librerías Utilizadas</h2>

<ul>
  <li><strong>Kotlin</strong>: Lenguaje de programación principal para la aplicación.</li>
  <li><strong>MVVM</strong>: Patrón de arquitectura que ayuda a organizar la aplicación y facilita la separación de la lógica de negocio de la UI.</li>
  <li><strong>Room</strong>: Base de datos local para almacenar mensajes y mantener el historial de conversaciones.</li>
  <li><strong>Coroutines</strong>: Para realizar tareas asíncronas de manera eficiente.</li>
  <li><strong>Android Jetpack</strong>: Utilizado para ViewModel, LiveData, y otras bibliotecas que facilitan el desarrollo en Android.</li>
</ul>

<h2>📦 Instalación</h2>

<p>Para clonar y ejecutar esta aplicación, asegúrate de tener <a href="https://developer.android.com/studio">Android Studio</a> instalado y sigue estos pasos:</p>

<ol>
  <li>Clona el repositorio:
    <pre><code>git clone https://github.com/tu-usuario/geminibot.git</code></pre>
  </li>
  <li>Abre el proyecto en Android Studio.</li>
  <li>Obtén tu API key de Gemini siguiendo el enlace: <a href="https://ai.google.dev/gemini-api/docs/api-key?hl=es-419" target="_blank">Obtener clave de API de Gemini</a>.</li>
  <li>Guarda la clave en el archivo <code>local.properties</code> del proyecto añadiendo la siguiente línea:
    <pre><code>apikey="TU_API_KEY"</code></pre>
  </li>
  <li>Ejecuta la aplicación en un emulador o dispositivo físico.</li>
</ol>
<h2>📱 Uso</h2>

<ol>
  <li><strong>Pantalla principal</strong>: Interactúa con GeminiBot en la <code>HomeView</code> para realizar consultas y obtener respuestas. Puedes enviar texto como a una IA convencional.</li>
  <li><strong>Análisis de imágenes</strong>: También puedes enviar una foto, y GeminiBot analizará la imagen y proporcionará una descripción detallada.</li>
</ol>

<h2>👥 Contribuciones</h2>

<p>Las contribuciones son bienvenidas. Si deseas contribuir a GeminiBot, por favor realiza un fork del proyecto y abre un Pull Request con tus mejoras.</p>

