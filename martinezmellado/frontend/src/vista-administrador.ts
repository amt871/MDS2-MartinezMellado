import { LitElement, html, css, customElement } from 'lit-element';
import './vista-iniciar_sesion';

@customElement('vista-administrador')
export class VistaAdministrador extends LitElement {
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
<vista-iniciar_sesion></vista-iniciar_sesion>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
