import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-videos_perfil_bloqueado')
export class VistaVideos_perfil_bloqueado extends LitElement {
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
