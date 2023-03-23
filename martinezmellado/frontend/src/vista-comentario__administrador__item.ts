import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
 <img style="height: 90%; margin-left: var(--lumo-space-s);" src="../../resources/icons/user.svg">
 <vaadin-horizontal-layout style="width: 100%; align-self: center; height: 100%; justify-content: center;">
  <label style="align-self: center;">Texto Comentario</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="align-self: center; align-items: center; flex-direction: column; flex-shrink: 1; flex-grow: 0; height: 100%; margin-right: var(--lumo-space-s); justify-content: center; width: 50%;">
  <vaadin-button style="width: 100%;">
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
