import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario__usuario_registrado__item')
export class VistaComentario__usuario_registrado__item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; position: relative; flex-direction: row;">
 <vaadin-horizontal-layout style="width: 40%; height: 100%;">
  <img style="max-width: 100%; max-height: 100%;" id="imgUser">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 40%; height: 100%; align-items: center; margin-left: var(--lumo-space-s);">
  <label id="labelComentario">Comentario</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 100%; width: 20%; justify-content: center; align-items: center;">
  <vaadin-button id="bDenunciar">
    Denunciar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
