import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-mi_video_item')
export class VistaMi_video_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-vertical-layout id="layoutVideo" style="width: 100%; height: 95%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 5%; align-items: center; justify-content: center;">
  <label id="labelTitulo" style="position: absolute;">Titulo </label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
