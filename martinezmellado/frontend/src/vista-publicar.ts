import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comercial';
import './vista-mi_cabecera';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

@customElement('vista-publicar')
export class VistaPublicar extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 5%;">
  <vista-cabecera_comercial style="width: 100%;"></vista-cabecera_comercial>
  <vista-mi_cabecera style="width: 100%;"></vista-mi_cabecera>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; align-items: flex-start; margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xs);">
   <img style="height: 100%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; align-items: center;">
   <iron-icon style="width: 20%; height: 20%;" src="../../resources/icons/user.svg"></iron-icon>
   <vaadin-text-field label="Ubicacion" style="width: 60%;"></vaadin-text-field>
   <vaadin-text-area label="Descripcion" style="width: 60%; height: 40%;"></vaadin-text-area>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center; margin-top: var(--lumo-space-xl);">
    <vaadin-button>
      Subir video 
    </vaadin-button>
    <vaadin-upload></vaadin-upload>
   </vaadin-horizontal-layout>
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
