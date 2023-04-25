import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-video_otro_usuario_item')
export class VistaVideo_otro_usuario_item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <img id="idVideo" style="width: 100%; height: 100%;" src="icons/video.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
  <iron-icon style="width: 30%; height: 30%; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m);" icon="lumo:user"></iron-icon>Usuario 
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; padding-top: var(--lumo-space-l); padding-bottom: var(--lumo-space-l);">
   <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; padding-left: var(--lumo-space-xl);">
    <label id="idUbicación" style="align-self: center; flex-grow: 0; flex-shrink: 1;">Ubicación</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; padding-right: var(--lumo-space-xl);">
    <label id="IdFecha" style="flex-grow: 0; flex-shrink: 1;">Fecha de la publicación </label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 80%; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m);">
   <label id="idDescripcion">Esta es la descripcion de ejmplo de nuestras publicación</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl); width: 100%; justify-content: center; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m);">
   <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-items: center; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-button theme="icon" aria-label="Add new" id="idMeGusta">
     <iron-icon icon="vaadin:heart"></iron-icon>
    </vaadin-button>
    <label id="idNumMg">nº me gusta </label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-button theme="icon" aria-label="Add new" id="idComentarios">
     <iron-icon icon="vaadin:comments"></iron-icon>
    </vaadin-button>
    <label>nº comentario </label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="width: 100%; align-items: flex-end; padding-top: var(--lumo-space-l);">
   <vaadin-button>
     Denuciar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
