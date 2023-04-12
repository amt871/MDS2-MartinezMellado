import { LitElement, html, css, customElement } from 'lit-element';
import './vista-inicio_no_registrado';

@customElement('vista-usuario_no_registrado')
export class VistaUsuario_no_registrado extends LitElement {
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
<vista-inicio_no_registrado></vista-inicio_no_registrado>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
