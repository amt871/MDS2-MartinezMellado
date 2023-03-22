import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario__administrador__item')
export class VistaComentario__administrador__item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
 <iron-icon style="flex-shrink: 1; flex-grow: 0; height: 100%; width: 10%;" icon="lumo:user"></iron-icon>
 <label style="flex-grow: 1; flex-shrink: 0;">Texto Comentario</label>
 <vaadin-vertical-layout style="align-self: center; align-items: center; flex-direction: column; flex-shrink: 1; flex-grow: 0; height: 100%; margin-right: 1%; justify-content: center;">
  <vaadin-button>
    Eliminar 
  </vaadin-button>
  <label style="align-self: center;">Me gustas</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
