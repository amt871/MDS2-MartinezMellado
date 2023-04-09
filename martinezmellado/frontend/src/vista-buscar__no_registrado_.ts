import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscar__no_registrado_')
export class VistaBuscar__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%;">
  <vaadin-vertical-layout theme="spacing" style="width: 70%; height: 100%; align-items: center; justify-content: center;">
   <label>Videos de Hastag relacionados relevantes</label>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <label>Videos de Hastag mas relevantes</label>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 90%;" src="../../resources/icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 30%; height: 100%; align-items: center; justify-content: flex-start;">
   <vaadin-text-field></vaadin-text-field>
   <vaadin-button id="idBuscarUsuario">
    Buscar usuario
   </vaadin-button>
   <vaadin-button id="idBUscarHastag">
    Buscar Hastag
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
