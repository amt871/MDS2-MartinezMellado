import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-busqueda__administrador_')
export class VistaBusqueda__administrador_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: flex-start;" theme="spacing">
   <label style="margin-top: var(--lumo-space-m);">Videos de hashtag mas relevantes</label>
   <vaadin-horizontal-layout style="width: 100%; align-self: center; justify-content: space-around; align-items: center;">
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario </label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 80%; height: 80%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: space-around; align-self: center;">
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario </label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label style="margin-top: var(--lumo-space-m);">Videos de hashtag relacionados mas relevantes </label>
   <vaadin-horizontal-layout style="width: 100%; align-self: center; align-items: center; justify-content: center;">
    <vaadin-vertical-layout style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 75%; align-self: center; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; align-self: center; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; align-self: center; height: 75%;" src="icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; align-self: center; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: space-around; width: 100%;">
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <img style="width: 75%; height: 75%;" src="icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 30%; flex-shrink: 0; align-items: center; justify-content: flex-start;">
   <vaadin-text-field style="margin-top: var(--lumo-space-xl); width: 60%;"></vaadin-text-field>
   <vaadin-button style="margin: var(--lumo-space-l); width: 60%;">
     Buscar Usuario 
   </vaadin-button>
   <vaadin-button style="width: 60%;">
     Buscar Hashtag 
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
