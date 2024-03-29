import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-horizontal-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; align-items: center; margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xs); height: 100%; justify-content: center;" id="layoutVideo">
   <img style="height: 90%; width: 90%;" src="icons/video.svg" id="prevVideo">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; align-items: center; height: 100%; justify-content: center;">
   <img id="imguser" style="max-height: 20%; max-width: 20%;">
   <vaadin-text-field label="Ubicacion" style="width: 60%;" id="ubicacion"></vaadin-text-field>
   <vaadin-text-area label="Descripcion" style="width: 60%; height: 40%;" id="descrpcion" maxlength="255"></vaadin-text-area>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center; margin-top: var(--lumo-space-xl);">
    <vaadin-button id="subirVideo">
      Subir video 
    </vaadin-button>
    <vaadin-upload id="uploader"></vaadin-upload>
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
