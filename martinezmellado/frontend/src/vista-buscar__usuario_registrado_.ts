import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscar__usuario_registrado_')
export class VistaBuscar__usuario_registrado_ extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="height: 100%; width: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="width: 70%; height: 95%; justify-content: center; align-items: center;">
   <vaadin-vertical-layout style="justify-content: flex-start; width: 100%; height: 45%; align-items: center;">
    <label style="padding-bottom: var(--lumo-space-s);">Videos de Hastag relacionados relevantes</label>
    <vaadin-horizontal-layout theme="spacing-xs" style="width: 100%; align-self: center; align-items: center; justify-content: space-around;">
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xs" style="width: 100%; align-self: center; align-items: center; justify-content: space-around;">
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: flex-start; height: 45%;">
    <label style="padding-top: var(--lumo-space-xl); padding-bottom: var(--lumo-space-s);">Videos de Hastag mas relevantes </label>
    <vaadin-horizontal-layout theme="spacing-xs" style="width: 100%; align-items: center; justify-content: space-around;">
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xs" style="width: 100%; align-items: center; justify-content: space-around;">
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
      <img id="idVideo" style="width: 75%;" src="icons/video.png">
      <label id="idNombreUsuario">Usuario</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 30%; height: 100%; align-items: center;">
   <vaadin-text-field style="padding-top: var(--lumo-space-m);"></vaadin-text-field>
   <vaadin-button>
     Buscar usuario 
   </vaadin-button>
   <vaadin-button>
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
