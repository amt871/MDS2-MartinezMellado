import { LitElement, html, css, customElement } from 'lit-element';
import './vista-perfil_comercial';

@customElement('vista-comercial')
export class VistaComercial extends LitElement {
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
<vista-perfil_comercial></vista-perfil_comercial>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
