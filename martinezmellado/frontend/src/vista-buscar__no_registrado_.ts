import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%; padding-top: var(--lumo-space-m);">
  <vaadin-vertical-layout style="width: 70%; height: 100%; justify-content: flex-start; align-items: center;">
   <label>Videos de Hastag relacionados relevantes</label>
   <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: flex-start; height: 45%;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <label>Videos de Hastag mas relevantes</label>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 45%; align-items: center; justify-content: center; padding-top: var(--lumo-space-xl);">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; justify-content: center;">
      <img style="width: 75%;" src="icons/video.png">
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
