import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';

@customElement('vista-comentario')
export class VistaComentario extends LitElement {
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

`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
