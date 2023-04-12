import { LitElement, html, css, customElement } from 'lit-element';
import './vista-video_otro_usuario';

@customElement('vista-usuario_registrado')
export class VistaUsuario_registrado extends LitElement {
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
<vista-video_otro_usuario></vista-video_otro_usuario>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
