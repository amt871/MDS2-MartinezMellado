import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-recuperar_contrasenna')
export class VistaRecuperar_contrasenna extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
