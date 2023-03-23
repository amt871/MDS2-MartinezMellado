import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera__administrador_';
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
 <vista-cabecera__administrador_ style="width: 100%; flex-shrink: 1; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 70%; align-items: center; justify-content: flex-start;">
   <label style="margin-top: var(--lumo-space-m);">Videos de hashtag mas relevantes</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; justify-content: space-around; align-items: center; margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center; margin-left: var(--lumo-space-xl);">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario </label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-xl);">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-around; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-m); align-self: center;">
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center; margin-left: var(--lumo-space-xl);">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario </label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-xl);">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label style="margin-top: var(--lumo-space-m);">Videos de hashtag relacionados mas relevantes </label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center; margin-left: var(--lumo-space-xl);">
     <img style="width: 90%; align-self: center;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
     <img style="width: 90%; align-self: center;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
     <img style="width: 90%; align-self: center;" src="../../resources/icons/video.png">
     <label style="align-self: center;">Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center; margin-right: var(--lumo-space-xl);">
     <img style="width: 90%; align-self: center;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: space-around; margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 100%;">
    <vaadin-vertical-layout theme="spacing-xs" style="margin-left: var(--lumo-space-xl); align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
     <label>Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="margin-right: var(--lumo-space-xl); align-items: center; justify-content: center;">
     <img style="width: 90%;" src="../../resources/icons/video.png">
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
