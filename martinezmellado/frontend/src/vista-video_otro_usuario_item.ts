import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: position: relative;">
 <vaadin-vertical-layout style="width: 50%; height: 100%; align-items: center; justify-content: center; position: relative;" id="layoutVideo"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
  <vaadin-button theme="icon" aria-label="Add new" id="usuarioButton" style="max-width: 30%; max-height: 30%; background-color:white;">
   <img id="imageButton" style="max-height: 80%; height: 100%; width: 100%;">
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; justify-content: center; align-items: flex-end;">
   <label id="labelUsuario" style="margin-top: var(--lumo-space-xl);">Label</label>
  </vaadin-horizontal-layout>
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
    <vaadin-button theme="icon" aria-label="Add new" id="idBMeGusta">
     <iron-icon icon="vaadin:heart"></iron-icon>
    </vaadin-button>
    <div id="DivNumMegustas">
     <label id="idNumMg">nº me gusta </label>
    </div>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-button theme="icon" aria-label="Add new" id="idBComentarios">
     <iron-icon icon="vaadin:comments"></iron-icon>
    </vaadin-button>
    <label id="idNumComentarios">nº comentario </label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="width: 100%; align-items: flex-end; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l);">
   <vaadin-button id="denunciarButton">
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
